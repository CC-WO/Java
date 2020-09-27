package exday7;

public class SampleException extends Exception{
  //  シリアルバージョン番号
  private static final long serialVersionUID = 1L;

  //  コンストラクタ
  public SampleException(String message) {
      super(message);
  }
}
