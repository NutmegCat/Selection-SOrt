class selectionSort {
    public static void main(String[] args) {
        double[] list = new double[10];

        System.out.println("Please enter the values for the array ");

        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter a value for slot " + (i + 1) + " of the array: ");
            list[i] = In.getInt();
        }

        System.out.println("");

        System.out.print("Determine the K value: ");
        int k = In.getInt();

        System.out.println("");

        selectSort2(list, k);
    }

    public static void selectSort2(double[] list, int k) {
        for (int top = 0; top < k; top++) {
            int largeLoc = 0;
            for (int i = 1; i < list.length - top; i++) {
                if (list[i] > list[largeLoc]) {
                    largeLoc = i;
                }
            }

            double temp = list[largeLoc];
            list[largeLoc] = list[list.length - 1 - top];
            list[list.length - 1 - top] = temp;
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}