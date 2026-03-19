package guru.qa;

import guru.qa.data.Card;
import guru.qa.data.MasterCard;
import guru.qa.data.UnionPayCard;
import guru.qa.data.VisaCard;

import static guru.qa.data.Country.RU;

public class Oop {
    public static void main(String[] args){
        invoke(new UnionPayCard());
    }

    public static void invoke(Card card){
        card.setBalance(100);
        card.payInCountry(RU,50);
        System.out.println("Current balance "+card.getBalance());
    }
}

