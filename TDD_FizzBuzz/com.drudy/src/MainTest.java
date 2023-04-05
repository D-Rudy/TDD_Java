import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private Main main = new Main();
    @Test
    void testDoitAfficher1(){
        assertEquals("1", main.afficher(1, 1));
    }
    @Test
    void testDoitAfficher2(){
        assertEquals("2", main.afficher(2, 2));
    }

    @Test
    void testDoitAfficherFizzSiNombreEst3(){
        assertEquals("Fizz", main.afficher(3, 3));
    }
    @Test
    void testDoitAfficherBuzzSiNombreEst5(){
        assertEquals("Buzz", main.afficher(5, 5));
    }
    @Test
    void testDoitAfficherFizzSiNombreEst6(){
        assertEquals("Fizz", main.afficher(6, 6));
    }
    @Test
    void testDoitAfficherBuzzSiNombreEst10(){
        assertEquals("Buzz", main.afficher(10, 10));
    }
    @Test
    void testDoitAfficherFizzBuzzSiNombreEst15(){
        assertEquals("FizzBuzz", main.afficher(15, 15));
    }
    @Test
    void testDoitAfficherFizzBuzzSiNombreEst30(){
        assertEquals("FizzBuzz", main.afficher(30, 30));
    }
    @Test
    void testDoitAfficher12SiNombreEst1EtNombreEst2(){
        assertEquals("12", main.afficher(1, 2));
    }
    @Test
    void testDoitAfficher12FizzSiNombreEst123(){
        assertEquals("12Fizz", main.afficher(1, 3));
    }
    @Test
    void testDoitAfficher12Fizz4BuzzSiNombreDe1A5(){
        assertEquals("12Fizz4Buzz", main.afficher(1, 5));
    }
    @Test
    void testDoitAfficherFizzBuzzOuLeChiffreDe1A100(){
        assertEquals("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3132Fizz34BuzzFizz3738FizzBuzz41Fizz4344FizzBuzz4647Fizz49BuzzFizz5253FizzBuzz56Fizz5859FizzBuzz6162Fizz64BuzzFizz6768FizzBuzz71Fizz7374FizzBuzz7677Fizz79BuzzFizz8283FizzBuzz86Fizz8889FizzBuzz9192Fizz94BuzzFizz9798FizzBuzz", main.afficher(1, 100));

    }
}