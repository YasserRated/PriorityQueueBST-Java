class PriorityQueueBST {
    Node root;
    int comparisons = 0;
    int swaps = 0;

    // Push function = insert by grade
    public void push(Student student) {
        root = insert(root, student);
    }

    private Node insert(Node root, Student student) {
        if (root == null) {
            return new Node(student);
        }
        comparisons++;
        if (student.grade < root.student.grade) {
            root.left = insert(root.left, student);
        } else {
            root.right = insert(root.right, student);
        }
        return root;
    }

    // Pop function = remove student with highest grade
    public Student pop() {
        if (root == null)
            return null;
        Node parent = null;
        Node current = root;

        while (current.right != null) {
            parent = current;
            current = current.right;
            comparisons++;
        }

        swaps++;
        Student topStudent = current.student;

        if (parent == null) {
            root = root.left;
        } else {
            parent.right = current.left;
        }

        return topStudent;
    }

    // Inorder traversal to display students
    public void displayInOrder(Node node) {
        if (node != null) {
            displayInOrder(node.left);
            System.out.println(node.student);
            displayInOrder(node.right);
        }
    }

    public void display() {
        displayInOrder(root);
    }

    public int getComparisons() {
        return comparisons;
    }

    public int getSwaps() {
        return swaps;
    }
}