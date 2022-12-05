Filename: “Coin.java”
//define the class Coin
public class Coin implements Measurable
        {
//declare the class members
private double value;
private String name;
//define a Coin
public Coin(double aValue, String aName)
        {
//set the value of class members
        value = aValue;
        name = aName;
        }
//getter for value
public double getValue()
        {
//return value
        return value;
        }
//define method getMeasure()
public double getMeasure()
        {
//return value
        return value;
        }
//define the method getName()
public String getName()
        {
//return the name
        return name;
        }
//define the method toString()
public String toString()
        {
//return the value and name as strings
        return "Coin[value=" + value + ",name=" + name + "]";
        }
        }
        Filename: “Measurable.java”
//define an interface Measurable
public interface Measurable
{
    //declare the method getMeasure()
    double getMeasure();
}
Filename: “Pair.java”
//define class Pair
public class Pair<T, S>
{
//define the class members
    private T first;
    private S second;
    //constructor
    public Pair(T firstElement, S secondElement)
    {
//set class elements
        first = firstElement;
        second = secondElement;
    }
//getter for first
    public T getFirst()
{
//return the value
    return first;
}
//getter for second
    public S getSecond()
{
//return the second
    return second;
}
}
Filename: “PairUtil.java”
//define a class PairUtil
public class PairUtil
{
//define a method minmax
    public static <E extends Measurable> Pair<E, E> minmax(E[] a)


{
//if length of a is 0
    if (a.length == 0)
//return null
    return null;
//declare a variable min and set first element of a to it
    E min = a[0];
//declare a variable max and set first element of a to it
    E max = a[0];
//iterate a for loop
    for (E element : a)
    {
//if element is less than min
        if (element.getMeasure() < min.getMeasure())
//set min equal to element
        min = element;
//if element is greater than max
        if (element.getMeasure() > max.getMeasure())
//set max equal to element
        max = element;
    }
//create new pair and return it
    return new Pair<E, E>(min, max);
}
}
Filename: “MinMaxTester.java”
//deine a class MinMaxTester
public class MinMaxTester
{
    //define the main method
    public static void main(String[] args)
    {
//create a array coins of type Coin
        Coin[] coins =
                {
//adding elements to array
                        new Coin(0.1, "Dime"),
                        new Coin(0.05, "Nickel"),
                        new Coin(0.01, "Penny"),
                        new Coin(0.25, "Quarter")
                };
//define a Pair mm
        Pair<Coin, Coin> mm = PairUtil.minmax(coins);
//print first coin
        System.out.println(mm.getFirst());
//print the expected result
        System.out.println("Expected: Coin[value=0.01,name=Penny]");
//print second coin
        System.out.println(mm.getSecond());
//print the expected result
        System.out.println("Expected: Coin[value=0.25,name=Quarter]");
    }
}

output:

        Coin[value=0.01,name=Penny]
        Expected: Coin[value=0.01,name=Penny]
        Coin[value=0.25,name=Quarter]
        Expected: Coin[value=0.25,name=Quarter]



//########2



        Filename: “Pair.java”
//define class Pair
public class Pair<T, S>
{
    //define the class members
    private T first;
    private S second;
    //constructor
    public Pair(T firstElement, S secondElement)
    {
//set class elements
        first = firstElement;
        second = secondElement;
    }
    //getter for first
    public T getFirst()
    {
//return the value
        return first;
    }
    //getter for second
    public S getSecond()
    {
//return the second
        return second;
    }
}
Filename: “PairUtil.java”
//define a class PairUtil
public class PairUtil
{
    //define the method minmax()
    public static <E extends Comparable<E>> Pair<E, E> minmax(E[] a)
    {
//if length of a is zero
        if (a.length == 0)
//return null
            return null;
//declare a variable min and set first element of a to it
        E min = a[0];
//declare a variable max and set first element of a to it
        E max = a[0];
//iterate a for loop
        for (E element : a)
        {
//if element is less than min
            if (element.compareTo(min) < 0)
//set min equal to element
                min = element;
//if element is greater than max
            if (element.compareTo(max) > 0)
//set max equal to element
                max = element;
        }
//create new pair and return it
        return new Pair<E, E>(min, max);
    }
}
Filename: “MinMaxTester.java”
//define the class MinMaxTester
public class MinMaxTester
{
    //define the main method
    public static void main(String[] args)
    {
//define the string array words
        String[] words =
                {
                        "Mary", "had", "a", "little", "lamb"
                };
//define a pair
        Pair<String, String> mm = PairUtil.minmax(words);
//get the first element of the pair
        System.out.println(mm.getFirst());
//print the expected result
        System.out.println("Expected: Mary");
//print the second element of the pair
        System.out.println(mm.getSecond());
//print the expected result
        System.out.println("Expected: little");
    }
}

 

Output:
        Mary
        Expected: Mary
        little
        Expected: little



//#############3




        Filename: “Pair.java”
//define class Pair
public class Pair<T, S>
{
//define the class members
    private T first;
    private S second;
    //constructor
    public Pair(T firstElement, S secondElement)
    {
//set class elements
        first = firstElement;
        second = secondElement;
    }
//getter for first
    public T getFirst()
{
//return the value
    return first;
}
//getter for second
    public S getSecond()
{
//return the second
    return second;
}
}
Filename: “PairUtil.java”
//define a class PairUtil
public class PairUtil
{
//define the method minmax()
    public static <E extends Comparable<? super E>> Pair<E, E> minmax(E[] a)
{
//if length of a is zero
    if (a.length == 0)
//return null
    return null;
//declare a variable min and set first element of a to it
    E min = a[0];
//declare a variable max and set first element of a to it


    E max = a[0];
//iterate a for loop
    for (E element : a)
    {
//if element is less than min
        if (element.compareTo(min) < 0)
//set min equal to element
        min = element;
//if element is greater than max
        if (element.compareTo(max) > 0)
//set max equal to element
        max = element;
    }
//create new pair and return it
    return new Pair<E, E>(min, max);
}
}
Filename: “BankAccount.java”
//define a class BaknAccount
public class BankAccount implements Comparable<BankAccount>
{
//define the class member balance
private double balance;
//define the consrtructor BankAccount
public BankAccount()
        {
//set the value of balance
        balance = 0;
        }
//define the consrtructor BankAccount
public BankAccount(double initialBalance)
        {
//set the value of balance
        balance = initialBalance;
        }
//define a method deposit()
public void deposit(double amount)
        {
//set the newBalance
        double newBalance = balance + amount;
//set balance equal to newBalance
        balance = newBalance;
        }
//define the method withdraw()
public void withdraw(double amount)
        {
//set the newBalance
        double newBalance = balance - amount;
//set balance equal to newBalance
        balance = newBalance;
        }
//define the method getBalance()
public double getBalance()
        {
//return the value of balance
        return balance;
        }
//define the method compareTo()
public int compareTo(BankAccount other)
        {
//calculate d
        double d = balance - other.balance;
//if d is less than 0
        if (d < 0)
//return -1
        return -1;
//if d greater than o
        if (d > 0)
//return 1
        return 1;
//return 0
        return 0;
        }
        }
        Filename: “SavingsAccount.java”
//define a class SavingsAccount by extending BankAccount
public class SavingsAccount extends BankAccount
        {
//declare a variable interestRate
private double interestRate;
//define constructor SavingsAccount()
public SavingsAccount(double rate)
        {
//set the value of interestRate
        interestRate = rate;
        }
//set the method addInterest()
public void addInterest()
        {
//calculate the interest
        double interest = getBalance() * interestRate / 100;
//call the method deposit()
        deposit(interest);
        }
        }
        Filename: “MinMaxTester.java”
//define new class MinMaxTester
public class MinMaxTester
{
    //define main method
    public static void main(String[] args)
    {
//define a object array accounts
        SavingsAccount[] accounts =
                {
//add values to array
                        new SavingsAccount(10),
                        new SavingsAccount(10),
                        new SavingsAccount(5),
                };
//call the method deposit to add elements to account
        accounts[0].deposit(1000);
        accounts[1].deposit(10000);
        accounts[2].deposit(10000);
//iterate a for loop
        for (SavingsAccount a : accounts)
//call addInterest on a
        a.addInterest();
//define a pair mm
        Pair<SavingsAccount, SavingsAccount> mm
                = PairUtil.minmax(accounts);
//get the first element of the pair
        System.out.println(mm.getFirst().getBalance());
//print the expected result
        System.out.println("Expected: 1100");
//print the second element of the pair
        System.out.println(mm.getSecond().getBalance());
//print the expected result
        System.out.println("Expected: 11000");
    }
}


Output:
        1100.0
        Expected: 1100
        11000.0
        Expected: 11000



//##############4



        Filename: “Measurable.java”
        //import the required packages
        import java.util.ArrayList;
//define an interface Measurable
public interface Measurable<T>
{
    //declare the method getMeasure()
    public double getMeasure();
    //define the method largest()
    public static <T extends Measurable<T>> T largest(ArrayList<T> objects)
    {
//if the size of object is equal to size
        if (objects.size() == 0)
        {
//return null
            return null;
        }
//define a variable largest and set the first element of objects to it
        T largest = objects.get(0);
//iterarate a for loop
        for (T obj : objects)
        {
//if the condition is true
            if (obj.getMeasure() > largest.getMeasure())
            {
//set largest equal to obj
                largest = obj;
            }
        }
//return the value of largest
        return largest;
    }
}
Filename: “BankAccount.java”
//define the class BankAccount
public class BankAccount implements Measurable<BankAccount>
{
    //define the class member balance
    private double balance;
    //define the consrtructor BankAccount
    public BankAccount(double initial)
    {
//set the value of balance
        balance = initial;
    }
    //define a method deposit()
    public void deposit(double amt)
    {
//set the balance
        balance += amt;
    }
    //define the method withdraw()
    public void withdraw(double amt)
    {
//set the balance
        balance -= amt;
    }
    //define the method getBalance()
    public double getBalance()
    {
//return the value of balance
        return balance;
    }
    //define the method getMeasure()
    public double getMeasure()
    {
//return the value of balance
        return balance;
    }
}
Filename: “Country.java”
//define the class Country
public class Country implements Measurable<Country>
{
    //define the class members
    private String name;
    private double area;
    //define the constructor Country
    public Country(String aName, double anArea)
    {
//set the value of class members
        name = aName;
        area = anArea;
    }
    //define a method getName()
    public String getName()
    {
//return the name
        return name;
    }
    //define a method getArea()
    public double getArea()
    {
//return the area
        return area;
    }
    //define a method getMeasure()
    public double getMeasure()
    {
//return area
        return area;
    }
}
Filename: “MeasurableTester.java”
        //import the required packages
        import java.util.ArrayList;
//define a class MeasurableTester
public class MeasurableTester
{
    //define main method
    public static void main(String[] args)
    {
//create an array list accounts
        ArrayList<BankAccount> accounts = new ArrayList<>();
//add elements to accounts
        accounts.add(new BankAccount(0));
        accounts.add(new BankAccount(10000));
        accounts.add(new BankAccount(2000));
//create the variable of BankAccount
        BankAccount largestAccount = Measurable.largest(accounts);
//print the largest balance
        System.out.println("Largest balance is : " + largestAccount.getBalance());
//print the expected value
        System.out.println("Expected: 10000");
//create an array list countries
        ArrayList<Country> countries = new ArrayList<>();
//add elements to contries
        countries.add(new Country("Uruguay", 176220));
        countries.add(new Country("Thailand", 513120));
        countries.add(new Country("Belgium", 30510));
//create the variable of Country
        Country largestCountry = Measurable.largest(countries);
//print the largest area
        System.out.println("Largest area: " + largestCountry.getArea());
//print the expected value
        System.out.println("Expected: 513120");
//print the country name
        System.out.println("Country name: " + largestCountry.getName());
//print the expected value
        System.out.println("Expected: Thailand");
    }
}

    Sample Output

Output:
        Largest balance is : 10000.0
        Expected: 10000
        Largest area: 513120.0
        Expected: 513120
        Country name: Thailand
        Expected: Thailand



        ###########5


        Filename: “Measurable.java”
        //import the required packages
        import java.util.ArrayList;
//define an interface Measurable
public interface Measurable<T>
{
    //declare the method getMeasure()
    public double getMeasure();
    //define the method largest()
    public static <E extends Measurable<? super E>> E largest(ArrayList<E> objects)
    {
//if the size of object is equal to size
        if (objects.size() == 0)
        {
//return null
            return null;
        }
//define a variable largest and set the first element of objects to it
        E largest = objects.get(0);
//iterarate a for loop
        for (E obj : objects)
        {
//if the condition is true
            if (obj.getMeasure() > largest.getMeasure())
            {
//set largest equal to obj
                largest = obj;
            }
        }
//return the value of largest
        return largest;
    }
}
Filename: “BankAccount.java”
//define the class BankAccount
public class BankAccount implements Measurable<BankAccount>
{
    //define the class member balance
    private double balance;
    //define the consrtructor BankAccount
    public BankAccount(double initial)
    {
//set the value of balance
        balance = initial;
    }
    //define a method deposit()
    public void deposit(double amt)
    {
//set the balance
        balance += amt;
    }
    //define the method withdraw()
    public void withdraw(double amt)
    {
//set the balance
        balance -= amt;
    }
    //define the method getBalance()
    public double getBalance()
    {
//return the value of balance
        return balance;
    }
    //define the method getMeasure()
    public double getMeasure()
    {
//return the value of balance
        return balance;
    }
}
Filename: “SavingsAccount.java”
//define a class SavingsAccount
public class SavingsAccount extends BankAccount
{
    //define the class member interestRate
    private double interestRate;
    //define the constructor
    public SavingsAccount(double initial, double rate)
    {
//set the value of initial of class BankAccount
        super(initial);
//set the value of interestRate
        interestRate = rate;
    }
    //define the method monthEnd
    public void monthEnd()
    {
        /* some stuff with rate */
    }
}
Filename: “MeasurableTester.java”
        //import the required packages
        import java.util.ArrayList;
//define a class MeasurableTester
public class MeasurableTester
{
    //define main method
    public static void main(String[] args)
    {
//create an array list accounts
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new BankAccount(0));
        accounts.add(new BankAccount(10000));
        accounts.add(new BankAccount(2000));
//find the largest of accounts
        BankAccount largestAccount = Measurable.largest(accounts);
//print the largest balance
        System.out.println("Largest balance is : " + largestAccount.getBalance());
//print the expected value
        System.out.println("Expected: 10000");
//create an array list saccounts
        ArrayList<SavingsAccount> saccounts = new ArrayList<>();
//add elements to saccounts
        saccounts.add(new SavingsAccount(5000, 10.2));
        saccounts.add(new SavingsAccount(15000, 10.2));
//find the largest of saccounts
        SavingsAccount largestSavings = Measurable.largest(saccounts);
//print the largest balance
        System.out.println("Largest balance is : " + largestSavings.getBalance());
//print the expected value
        System.out.println("Expected: 15000");
//create an array list all
        ArrayList<BankAccount> all = new ArrayList<>();
//add elements of accounts to all
        all.addAll(accounts);
//add elements of aaccounts to all
        all.addAll(saccounts);
//find the largest of all
        BankAccount largestAll = Measurable.largest(all);
//print the largest balance
        System.out.println("Largest combined balance is : " + largestAll.getBalance());
//print the expected value
        System.out.println("Expected: 15000");
    }
}
    Sample Output
Output:
        Largest balance is : 10000.0
        Expected: 10000
        Largest balance is : 15000.0
        Expected: 15000
        Largest combined balance is : 15000.0
        Expected: 15000

        ##########6


        Filename: “ListUtil.java”
        //import the required packages
        import java.util.function.Predicate;
        import java.util.List;
        import java.util.ArrayList;
//define the class ListUtil
public class ListUtil
{
    //define the generic method filter
    public static <T> List<T> filter(List<T> values, Predicate<? super T> p)
    {
//create an array list result
        List<T> result = new ArrayList<>();
//for every elements of values
        for (T obj : values)
        {
//if the condition is true
            if (p.test(obj))
//add element to result
                result.add(obj);
        }
// returns an ArrayList
        return result;
    }
}
Filename: “FilterTester.java”
        //import the required packages
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Arrays;
        import java.util.Iterator;
//define the class FilterTester
public class FilterTester
{
    //define the main method
    public static void main(String[] args)
    {
//create an array of strings
        String[] words = { "nonstrictured", "invalidating",
                "duskier", "snippetiness", "konakry", "gladiator",
                "codification", "tottenham", "denuclearize"
        };
//create a list of type List
        List<String> wordsList = Arrays.asList(words);
//call the method filter and set the value to longer
        List<String> longer = ListUtil.filter(wordsList, w->w.length() > 10);
//define iter
        Iterator<String> iter = longer.iterator();
//get the next token
        System.out.println(iter.next());
//print the expected token
        System.out.println("Expected: nonstrictured");
//get the next token
        System.out.println(iter.next());
//print the expected token
        System.out.println("Expected: invalidating");
//get the next token
        System.out.println(iter.next());
//print the expected token
        System.out.println("Expected: snippetiness");
//get the next token
        System.out.println(iter.next());
//print the expected token
        System.out.println("Expected: codification");
//get the next token
        System.out.println(iter.next());
//print the expected token
        System.out.println("Expected: denuclearize");
    }
}

Step 4 > Sample Output

        Output:
        nonstrictured
        Expected: nonstrictured
        invalidating
        Expected: invalidating
        snippetiness
        Expected: snippetiness
        codification
        Expected: codification
        denuclearize
        Expected: denuclearize


        #########7


        Filename: “ListUtil.java”
        //import the required packages
        import java.util.function.Function;
        import java.util.List;
        import java.util.ArrayList;
//define the class ListUtil
public class ListUtil
{
    //define the generic method map
    public static <R, T> List<R> map(List<T> values, Function<T, R> f)
    {
//create an array list result
        List<R> result = new ArrayList<>();
//for every elements of values
        for (T obj : values)
        {
//add element to result
            result.add(f.apply(obj));
        }
// returns an ArrayList
        return result;
    }
}
Filename: “MapTester.java”
        //import the required packages
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Arrays;
        import java.util.Iterator;
//define a class MapTester
public class MapTester
{
    //define the main method
    public static void main(String[] args)
    {
//create an array of strings
        String[] words = {"How", "doth", "the", "little", "crocodile",
                "Improve", "his", "shining", "tail,",
                "And", "pour", "the", "waters", "of", "the", "Nile",
                "On", "every", "golden", "scale!"
        };
//create a list of type List
        List<String> wordsList = Arrays.asList(words);
//call the method map and set the value to upper
        List<String> upper = ListUtil.map(wordsList, String::toUpperCase);
//call the method map and set the value to sizes
        List<Integer> sizes = ListUtil.map(wordsList, w -> w.length());
//define strItr
        Iterator<String> strItr = upper.iterator();
//get the next token
        System.out.println(strItr.next());
//print the expected token
        System.out.println("Expected: HOW");
//get the next token
        System.out.println(strItr.next());
//print the expected token
        System.out.println("Expected: DOTH");
//define intItr
        Iterator<Integer> intItr = sizes.iterator();
//get the next token
        System.out.println(intItr.next());
//print the expected token
        System.out.println("Expected: 3");
//get the next token
        System.out.println(intItr.next());
//print the expected token
        System.out.println("Expected: 4");
    }
}


Output:
        HOW
        Expected: HOW
        DOTH
        Expected: DOTH
        3
        Expected: 3
        4
        Expected: 4

        ############# 8

        Filename: “Pair.java”
//define class Pair
public class Pair<T, S>
{
    //define the class members
    private T first;
    private S second;
    //constructor
    public Pair(T firstElement, S secondElement)
    {
//set class elements
        first = firstElement;
        second = secondElement;
    }
    //getter for first
    public T getFirst()
    {
//return the value
        return first;
    }
    //getter for second
    public S getSecond()
    {
//return the second
        return second;
    }
}
Filename: “ListUtil.java”
        //import the required packages
        import java.util.function.Function;
        import java.util.List;
        import java.util.ArrayList;
//define the class ListUtil
public class ListUtil
{
    //define the generic method map
    public static <R, T> List<Pair<T, R>> map(List<T> values, Function<T, R> f)
    {
//create an array list result
        List<Pair<T,R>> result = new ArrayList<>();
//for every elements of values
        for (T obj : values)
        {
//add element to result
            result.add(new Pair(obj, f.apply(obj)));
        }
// returns an ArrayList
        return result;
    }
}
Filename: “MapTester.java”
        //import the required packages
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Arrays;
        import java.util.Iterator;
//define the class MapTester
public class MapTester
{
    //define main method
    public static void main(String[] args)
    {
//define a string array words
        String[] words = {"How", "doth", "the", "little", "crocodile",
                "Improve", "his", "shining", "tail,",
                "And", "pour", "the", "waters", "of", "the", "Nile",
                "On", "every", "golden", "scale!"
        };
//create a list wordList
        List<String> wordsList = Arrays.asList(words);
//call the method map() and set the value to sizes
        List<Pair<String,Integer>> sizes =
                ListUtil.map(wordsList, w -> w.length());
//define iter
        Iterator<Pair<String, Integer>> iter = sizes.iterator();
//get the next pair to entry
        Pair<String, Integer> entry = iter.next();
//print the first value=and second value of the pair
        System.out.println(entry.getFirst() + " = " + entry.getSecond());
//print the expected value
        System.out.println("Expected: How = 3");
//get the next pair to entry
        entry = iter.next();
//print the first value=and second value of the pair
        System.out.println(entry.getFirst() + " = " + entry.getSecond());
//print the expected value
        System.out.println("Expected: doth = 4");
//get the next pair to entry
        entry = iter.next();
//print the first value=and second value of the pair
        System.out.println(entry.getFirst() + " = " + entry.getSecond());
//print the expected value
        System.out.println("Expected: the = 3");
//get the next pair to entry
        entry = iter.next();
//print the first value=and second value of the pair
        System.out.println(entry.getFirst() + " = " + entry.getSecond());
//print the expected value
        System.out.println("Expected: little = 6");
//get the next pair to entry
        entry = iter.next();
//print the first value=and second value of the pair
        System.out.println(entry.getFirst() + " = " + entry.getSecond());
//print the expected value
        System.out.println("Expected: crocodile = 9");
    }
}



Output:
        How = 3
        Expected: How = 3
        doth = 4
        Expected: doth = 4
        the = 3
        Expected: the = 3
        little = 6
        Expected: little = 6
        crocodile = 9
        Expected: crocodile = 9Filename: “Coin.java”
