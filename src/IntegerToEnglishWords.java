public class IntegerToEnglishWords {
    public String numberToWords(int num) {
        if(num == 0) {
            return "Zero";
        }
        return helper(num);
    }

    private String helper(int num) {
        String[] below20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                            "Eighteen", "Nineteen"};
        String[] below100 = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
                             "Ninety"};
        String[] above1000 = {"", "Thousand", "Million", "Billion"};

        String result = "";
        for(int i=0; num > 0; i++) {
            if(num % 1000 != 0) {
                result = helper2(num % 1000) + above1000[i] + " " + result;
            }
            num /= 1000;
        }
        return result.trim();
    }

    private String helper2(int num) {
        String[] below20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                            "Eighteen", "Nineteen"};
        String[] below100 = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
                             "Ninety"};

        if(num == 0) {
            return "";
        } else if(num < 20) {
            return below20[num] + " ";
        } else if(num < 100) {
            return below100[num / 10] + " " + helper2(num % 10);
        } else {
            return below20[num / 100] + " Hundred " + helper2(num % 100);
        }
    }

    public static void main(String[] args) {
        IntegerToEnglishWords iew = new IntegerToEnglishWords();
        System.out.println(iew.numberToWords(1234567));
    }
}
