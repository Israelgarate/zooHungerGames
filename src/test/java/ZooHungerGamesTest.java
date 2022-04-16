import org.junit.Test;
import static org.junit.Assert.*;


public class ZooHungerGamesTest {

    ZooHungerGames objectTest = new ZooHungerGames();

    @Test
    public void zooTest() {
        final String input = "fox,bug,chicken,grass,sheep";
        final String[] expected = 	{
                "fox,bug,chicken,grass,sheep",
                "chicken eats bug",
                "fox eats chicken",
                "sheep eats grass",
                "fox eats sheep",
                "fox"};
        assertArrayEquals(expected, objectTest.whoEatsWho(input));
    }

    @Test
    public void zooTestNoEat() {
        final String input = "leaves,lion,busker,cow,little-fish,fox,big-fish";
        final String[] expected = 	{
                "leaves,lion,busker,cow,little-fish,fox,big-fish",
                "leaves,lion,busker,cow,little-fish,fox,big-fish"};
        assertArrayEquals(expected, objectTest.whoEatsWho(input));
    }

    @Test
    public void zooTestAnotherTest() {
        final String input = "little-fish,leaves,banana,bear,lion,antelope,bear,little-fish,grass,fox,banana";
        final String[] expected = 	{
                "little-fish,leaves,banana,bear,lion,antelope,bear,little-fish,grass,fox,banana",
                "lion eats antelope",
                "little-fish,leaves,banana,bear,lion,bear,little-fish,grass,fox,banana"};
        assertArrayEquals(expected, objectTest.whoEatsWho(input));
    }

    @Test
    public void zooTestAnotherTest2() {
        final String input = "busker,fox,giraffe,antelope,chicken,giraffe,fox,lion,antelope";
        final String[] expected = 	{
                "busker,fox,giraffe,antelope,chicken,giraffe,fox,lion,antelope",
                "lion eats antelope",
                "busker,fox,giraffe,antelope,chicken,giraffe,fox,lion"};
        assertArrayEquals(expected, objectTest.whoEatsWho(input));
    }

    @Test
    public void zooTestAnotherTest3() {
        final String input = "cow,antelope,little-fish,fox,bear,leaves,little-fish,sheep,antelope";
        final String[] expected = 	{
                "cow,antelope,little-fish,fox,bear,leaves,little-fish,sheep,antelope",
                "bear eats leaves",
                "cow,antelope,little-fish,fox,bear,little-fish,sheep,antelope"};
        assertArrayEquals(expected, objectTest.whoEatsWho(input));
    }

    @Test
    public void zooTestAnotherTest4() {
        final String input = "banana,antelope,antelope,lion,cow,big-fish,leaves,lion,bear,antelope,leaves,giraffe,chicken";
        final String[] expected = 	{
                "banana,antelope,antelope,lion,cow,big-fish,leaves,lion,bear,antelope,leaves,giraffe,chicken",
                "lion eats antelope",
                "lion eats antelope",
                "lion eats cow",
                "giraffe eats leaves",
                "banana,lion,big-fish,leaves,lion,bear,antelope,giraffe,chicken"};
        assertArrayEquals(expected, objectTest.whoEatsWho(input));
    }

    @Test
    public void zooTestAnotherTest5() {
        final String input = "giraffe,cow,antelope,banana,bug,bug,panda,banana,fox,antelope,antelope,lion,bicycle,panda";
        final String[] expected = 	{
                "giraffe,cow,antelope,banana,bug,bug,panda,banana,fox,antelope,antelope,lion,bicycle,panda",
                "lion eats antelope",
                "lion eats antelope",
                "giraffe,cow,antelope,banana,bug,bug,panda,banana,fox,lion,bicycle,panda"};
        assertArrayEquals(expected, objectTest.whoEatsWho(input));
    }

    @Test
    public void zooTestAnotherTest6() {
        final String input = "leaves,bug,chicken";
        final String[] expected = 	{
                "leaves,bug,chicken",
                "bug eats leaves",
                "chicken eats bug",
                "chicken"};
        assertArrayEquals(expected, objectTest.whoEatsWho(input));
    }

    @Test
    public void zooTestAnotherTest7() {
        final String input = "banana,sheep,bear,big-fish,sheep,leaves,bear,fox,sheep,little-fish,cow,giraffe";
        final String[] expected = 	{
                "banana,sheep,bear,big-fish,sheep,leaves,bear,fox,sheep,little-fish,cow,giraffe",
                "bear eats sheep",
                "bear eats big-fish",
                "bear eats sheep",
                "bear eats leaves",
                "fox eats sheep",
                "banana,bear,bear,fox,little-fish,cow,giraffe"};
        assertArrayEquals(expected, objectTest.whoEatsWho(input));
    }


    }


  /*  Random Test #1: ZOO = grass,panda,cow,giraffe
        grass,panda,cow,giraffe
        Random Test #2: ZOO = giraffe
        giraffe
        Random Test #3: ZOO =

        leaves,antelope,big-fish,big-fish,cow,little-fish,little-fish,giraffe,bug,fox

        Random Test #4: ZOO = lion,banana,fox,leaves,big-fish,leaves,little-fish,grass
        lion,banana,fox,leaves,big-fish,leaves,little-fish,grass
        Random Test #5: ZOO = sheep,lion,leaves,sheep,bicycle,giraffe
        sheep,lion,leaves,sheep,bicycle,giraffe
        Random Test #6: ZOO = big-fish,leaves,banana,bicycle,bear
        big-fish,leaves,banana,bicycle,bear
        Random Test #7: ZOO = big-fish,leaves,bicycle,lion,banana,antelope
        big-fish,leaves,bicycle,lion,banana,antelope
        Random Test #8: ZOO = lion,lion
        lion,lion
        Random Test #9: ZOO = leaves
        leaves
        Random Test #10: ZOO = panda,little-fish,giraffe,chicken,cow,banana,antelope,grass,little-fish,sheep
        antelope eats grass
        panda,little-fish,giraffe,chicken,cow,banana,antelope,little-fish,sheep
        Random Test #11: ZOO = sheep,fox,panda,fox
        fox eats sheep
        fox,panda,fox*/