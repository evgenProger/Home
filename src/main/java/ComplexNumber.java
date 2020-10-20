import java.util.Objects;

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {
    }




    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }


    @Override
    public boolean equals(Object o) {
      if(this == o)  return true;
      if (o == null || getClass() != o.getClass()) return false;
      ComplexNumber complexNumber = (ComplexNumber) o;
      if (re != complexNumber.re || im != complexNumber.im ) return false;
      return  true;
      }








      @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
