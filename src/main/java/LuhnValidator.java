class LuhnValidator {
    private String candidate;

    boolean isValid(String candidate) {
    try {
        this.candidate = candidate;
        if (this.candidate.length() <= 1) { return false; }
        String[] split = splitRawCandidate();
        int[] doubled = doubleSplitNum(split);
        System.out.println(this.candidate.length());
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        return sumOfAll(doubled) % 10 == 0;
    } catch (NumberFormatException e) {
        return false;
    }
    }
    
    private String[] splitRawCandidate() {
        String[] result = new String[0];
        String tempNum = "";
        for (int i = 0; i < this.candidate.length(); i++) {
            String character = this.candidate.valueOf(i);
            if (character == " ") {
                result = shovel(tempNum, result);
                tempNum = "";
            } else {
                Integer.parseInt(character);
                tempNum = tempNum + character;
            }
        }
        return result;
    }
    
    private int[] doubleSplitNum(String[] split) {
        int[] result = new int[0];
        for (int i = 0; i < split.length; i++) {
            String section = split[i];
            for (int x = 0; x < section.length(); x++) {
                String character = section.valueOf(x);
                int value = (x % 2 == 0) ? Integer.parseInt(character) : doubleVal(Integer.parseInt(character));
                result = push(value, result);
            }
        }
        return result;
    }
    
    private int sumOfAll(int[] doubled) {
        int sum = 0;
        for (int i = 0; i < doubled.length; i++) {
            sum = sum + doubled[i];
        }
        return sum;
    }

    private int doubleVal(int value) {
        int product = value * 2;
        if (product > 9) {
            return product - 9;
        } else {
            return product;
        }
    }

    private String[] shovel(String data, String[] array) {
        if (data == "") { return array; }
        int resultLength = array.length + 1;
        String[] result = new String[resultLength];
        for (int i = 0; i <= resultLength; i++) {
            result[i] = (i >= array.length) ? data : array[i];
        }
        return result;
    }
    
    private int[] push(int data, int[] array) {
        int resultLength = array.length + 1;
        int[] result = new int[resultLength];
        for (int i = 0; i <= resultLength; i++) {
            result[i] = (i >= array.length) ? data : array[i];
        }
        return result;
    }
}
