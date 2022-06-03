public class BubbleShort {
        public static  void main(String[] args){
            String nama [] = {"Upin", "Ipin", "Nana", "Miya", "Santo"};
            String temp;
            System.out.println("String in sorted order:");
            for (int j = 0; j < nama.length; j++){
                for (int i = j + 1; i < nama.length; i++){
                    // membandingkan String yang berdekatan
                    if (nama[i].compareTo(nama[j]) > 0){
                        temp = nama[j];
                        nama[j] = nama[i];
                        nama[i] = temp;
                    }
                }
                System.out.println(nama[j]);

            }
        }
    }

