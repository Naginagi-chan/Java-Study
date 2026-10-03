class ExceptionEx{
    public static void main(String[] args){
        try{
//            Exception e = new Exception("고의로 발생");
//            throw e;
            throw new Exception("고의로 발생");
        } catch (Exception e){
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("정상 종료됨");
    }
}