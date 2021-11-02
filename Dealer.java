
public class Dealer
{
private String dealerName, managerName;
private String phone;
private int time;
private double discount;
private boolean appointment;


public Dealer(String dealerName, String managerName, String phone, int time, double discount, boolean appointment)
{
this.dealerName = dealerName;
this.managerName = managerName;
this.phone = phone;
this.time = time;
this.discount = discount;
this.appointment = appointment;
}

public String toString()
{

String description;
description = "Dealer's name" + "\t" + "Phone Number" + "\t" + "Manager's name" + "\t" + "Discount rate" + "\t" + "Time cost" + "\n";
description += dealerName + "\t" + phone + "\t";
description += managerName + "\t" + "\t" + discount + "\t" + "\t" + time + " hours";

if (appointment)
    description += "\t" + "\t" + "Appointmented for a revisit";
return description;
}
}