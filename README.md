# Prime Number Game Assignment (More button, basic event handling, and toasts)

primenumbergame-melvincabatuan created by Classroom for GitHub

This assignment illustrates the usage of a simple Buttons and basic Event handling. It also introduces the application of toasts for user feedback.

## Problem:

Design and implement an Android game application that displays a random number (2 to 999) and lets the user guess whether that number is Prime or Composite. A correct answer is rewarded with +1 points while the incorrect answer is penalized with -5 points. Display the current score in a TextView. Provide feedback to the user after his/her answer using a Toast. 

## Basig Game Scoring Logic:

```Java
        if (!(isPrime(number) ^ answer)) {
            score++;
            Toast.makeText(this, "Congratulations! You are correct!", Toast.LENGTH_SHORT).show();
        } else {
            score = score - 5;
            Toast.makeText(this, "You are wrong!", Toast.LENGTH_SHORT).show();
        }
```


## Accept

To accept the assignment, click the following URL:

 https://classroom.github.com/assignment-invitations/79ec8cb2a6bd245be59e6c449c88656d  


## Sample Solution:

https://github.com/DeLaSalleUniversity-Manila/primenumbergame-melvincabatuan


## Keypoints:

In the MainActivity.java:

```Java
public class MainActivity extends AppCompatActivity {

    private int number;
    private int score;
    private boolean answer;

    public void onClickPrime(View view){
        #TODO
    }

    public void onClickComposite(View view){
        #TODO
    }

    private void verifyAnswer() {
        #TODO
    }

    private boolean isPrime(int value){
        #TODO
    }

    private void displayRandomNumber(){
        #TODO
    }

    private void displayScore(){
        #TODO
    }
    ...
```


In the layout xml file, the Buttons are arranged horizontally using Linear Layout:
```xml
    <LinearLayout
        android:id="@+id/buttongroup"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_below="@+id/textViewNumber"
        android:layout_marginTop="20dp"
        >


        <Button
            android:id="@+id/prime_button"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:layout_height="wrap_content"
            android:layout_centerHorizontal="true"
            android:onClick="onClickPrime"
            android:text="@string/prime"
            />

        <Button
            android:id="@+id/composite_button"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:layout_height="wrap_content"
            android:layout_centerHorizontal="true"
            android:onClick="onClickComposite"
            android:text="@string/composite" />


    </LinearLayout>
```




## Submission Procedure with Git (sample): 

```shell
$ cd /path/to/your/android/app/
$ git init
$ git add –all
$ git commit -m "your message, e.x. Assignment 1 submission"
$ git remote add origin <Assignment link copied from assignment github, e.x. https://github.com/DeLaSalleUniversity-Manila/secondactivityassignment-melvincabatuan.git>
$ git push -u origin master
<then Enter Username and Password>
```

Ex. https://gist.github.com/melvincabatuan/38393f713cb07f4d767f  


## Screenshots:

![alt tag](https://github.com/BananaSpoon/PrimeNumberGame/blob/master/device-2015-10-04-200905.png)

![alt tag](https://github.com/BananaSpoon/PrimeNumberGame/blob/master/device-2015-10-04-200922.png)
