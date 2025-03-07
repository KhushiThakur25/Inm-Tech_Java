class PlusOne {
    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] ar = { 3, 2, 9 };

        ar = plusOne(ar);
        for (int i : ar) {
            System.out.print(i + " ");
        }

    }
}