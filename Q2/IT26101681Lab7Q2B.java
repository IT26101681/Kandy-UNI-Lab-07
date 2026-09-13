class IT26101681Lab7Q2B{
    public static void main(String[] args) {
        
        for (int rowCount = 1; rowCount <= 5; rowCount++) {
            
            
            System.out.print(rowCount + " - ");
            
           
            for (int columnCount = 0; columnCount < rowCount; columnCount++) {
                System.out.print("* ");
            }
            
            
            System.out.println();
        }
    }
}