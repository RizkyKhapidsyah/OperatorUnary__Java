/**
 * @author RizkyKhapidsyah
 */
public class OperatorUnary {
   /*
    *   Unary adalah Operasi yang dilakukan pada Satu variabel.
    *   Unary terdiri dari :
    *   +               (Plus)
    *   -               (Minus)
    *   ++              (Increment)
    *   --              (Decrement)
    *   true            (Boolean)
    *   false atau !    (Boolean)
    */
    
    public static void main(String[] args)
    {
        //Unary + Dan -
        int X; 
        boolean B;
        
        X = 14; //Inisialisasi Nilai Awal
        System.out.printf("Unary Plus (+), %d menjadi %d\n", X, +X); //Tanda Plus '+' tidak ditampilkan (default).
        System.out.printf("Unary Minus (-), %d menjadi %d\n\n", X, -X); //Tanda Minus '-' ditampilkan.
        
        //Unary Decrement & Increment
        X = 14; //Variabel X, Di Atur Ke Nilai Awal Agar Tidak Terpengaruh Oleh Proses Sebelumnya
        X++;    //Unary Increment
        System.out.println("Unary Increment Nilai dengan '++' menjadi : " + X);
        X--;    //Unary Decrement
        System.out.println("Unary Decrement Nilai dengan '--' menjadi : " + X);

        //Increment: Prefix & Postfix
        X = 14; //Variabel X, Di Atur Ke Nilai Awal Agar Tidak Terpengaruh Oleh Proses Sebelumnya
        System.out.printf("\n => Unary Increment: Prefix '++X' menjadi : %d\n", ++X);  //++X artinya Nilai dari variabel X akan ditambah 1 terlebih dahulu baru ditampilkan
        X = 14; //Variabel X, Di Atur Ke Nilai Awal Agar Tidak Terpengaruh Oleh Proses Sebelumnya
        System.out.printf(" => Unary Increment: Postfix 'X++' menjadi : %d\n", X++);     /*  X++ artinya Nilai dari variabel X ditampilkan terlebih darulu baru ditambah 1, 
                                                                                        hasil setelah ditambah 1 akan ditampilkan jika ada perintah selanjutnya untuk mencetak ke layar,
                                                                                        Seperti perintah berikut ini:
                                                                                    */  
        System.out.println(" => Unary Increment: Nilai dari Postfix menjadi : " + X);
        
        
        //Decrement: Prefix & Postfix
        X = 14; //Variabel X, Di Atur Ke Nilai Awal Agar Tidak Terpengaruh Oleh Proses Sebelumnya
        System.out.printf("\n => Unary Decrement: Prefix '--X' menjadi : %d\n", --X);  //++X artinya Nilai dari variabel X akan ditambah 1 terlebih dahulu baru ditampilkan
        X = 14; //Variabel X, Di Atur Ke Nilai Awal Agar Tidak Terpengaruh Oleh Proses Sebelumnya
        System.out.printf(" => Unary Decrement: Postfix 'X--' menjadi : %d\n", X--);     /*  X++ artinya Nilai dari variabel X ditampilkan terlebih darulu baru ditambah 1, 
                                                                                        hasil setelah ditambah 1 akan ditampilkan jika ada perintah selanjutnya untuk mencetak ke layar,
                                                                                        Seperti perintah berikut ini:
                                                                                    */  
        System.out.println(" => Unary Decrement: Nilai dari Postfix menjadi : " + X);
        
        //Unary Boolean Dengan tanda '!' Untuk Negasi
        B = true;
        System.out.println("\nNilai Awal Boolean dari Variabel = " + B);     //True
        System.out.println("Nilai Boolean (Tambah 1 Tanda Seru '!' (!Variabel) Menjadi     = " + !B);      //False
        System.out.println("Nilai Boolean (Tambah 2 Tanda Seru '!' (!!Variabel) Menjadi    = " + !!B);     //True
        System.out.println("Nilai Boolean (Tambah 3 Tanda Seru '!' (!!!Variabel) Menjadi   = " + !!!B);    //False
        System.out.println("Nilai Boolean (Tambah 4 Tanda Seru '!' (!!!!Variabel) Menjadi  = " + !!!!B);   //True (begitulah seterusnya jika tanda seru '!' bertambah 1 maka akan berubah nilainya.
        System.out.print("(Begitulah seterusnya jika tanda seru '!' bertambah 1 maka akan berubah nilainya/boolean).\n\n");
    }
}
