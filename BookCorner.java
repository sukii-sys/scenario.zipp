public class BookCorner{
    public static void main (String[]args){
        String[] categories= {"Fiction","English"};
        String[][] titles = new String[2][1];
        double [][] price = new double [2][1];
        titles[0][0]="November-9";
        price[0][0] = 750.00;
        titles [1][0] = "It Ends With Us";
        price [1][0] = 800.00;
        for (int i=0;i<categories.length;i++){
             System.out.println("Categories :" + categories[i]);
             for (int j = 0; j< titles[i].length;j++){
                 if (titles [i][j] !=null){
                     System.out.println("Title :"+ titles[i][j]+" | Price :"+price[i][j]);
                 }
             }
         }
    }
}