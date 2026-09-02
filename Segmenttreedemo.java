class SegmenttreeDemo {
    static int[] Tree;
    static int n;

    // Build segment tree
    public static void build(int[] arr, int node, int start, int end) {
        if (start == end) {
            Tree[node] = arr[start];
        } else {
            int mid = (start + end) / 2;
            build(arr, 2 * node, start, mid);          // left child
            build(arr, 2 * node + 1, mid + 1, end);    // right child
            Tree[node] = Tree[2 * node] + Tree[2 * node + 1];
        }
    }

    public static int query(int node, int start, int end, int l, int r) {
        if (r < start || end < l) {
            return 0; // no overlap
        }
        if (l <= start && end <= r) {
            return Tree[node]; // total overlap
        }
        int mid = (start + end) / 2;
        int p1 = query(2 * node, start, mid, l, r);
        int p2 = query(2 * node + 1, mid + 1, end, l, r);
        return p1 + p2;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70,80};
        n = arr.length;
        Tree = new int[4 * n]; // allocate enough space

        build(arr, 1, 0, n - 1);

        int sum1 = query(1, 0, n - 1, 2, 5);   // sum of arr[2..5]
        int sum2 = query(1, 0, n - 1, 3, 7);   // sum of arr[3..7]
        int sumAll = query(1, 0, n - 1, 0, n - 1); // sum of all

        System.out.println("Sum of [2,5]: " + sum1);
        System.out.println("Sum of [3,7]: " + sum2);
        System.out.println("Sum of all: " + sumAll);
    }
}
