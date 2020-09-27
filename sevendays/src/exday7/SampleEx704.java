package exday7;

public class SampleEx704 {
  public static void main(final String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    try{
        //  故意に例外を発生させる
        throw new SampleException("自作の例外のサンプル");
    }catch(final SampleException e){
        e.printStackTrace();
    }
  }
}
