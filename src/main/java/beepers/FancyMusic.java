package beepers;

public class FancyMusic implements Beeper{
    @Override
    public String makeSound() {
        return "What is love?";
    }
    public String checkArtist() {
        return "Various artist";
    }
}
