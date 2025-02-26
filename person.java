class person {
    
        String name = "kamali";
        int age=17;
        
        public void introduction()
        {
            
            System.out.println("my name is :"+name+ "my  age is :+age);
 
         }
       public static void main(String[] args)
         {       
                 person p1 = new person();
                 p1.introduction();
         } 
}