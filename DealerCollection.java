import java.text.NumberFormat;
public class DealerCollection
{
private Dealer[] collection;
private int count;
private double totalTimeCost;


public DealerCollection()
{
    collection = new Dealer[10];
    count = 0;
    totalTimeCost = 0;
}


public void addDealer(String dealerName, String managerName, String phone, int time, double discount, boolean appointment)
{
if (count == collection.length)
    increaseSize();

collection[count] = new Dealer(dealerName, managerName, phone, time, discount, appointment);

totalTimeCost += time;
count++;
}

public String toString()
{


String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
report += "My Dealer List\n\n";
report += "Number of Dealers: " + (count - 1) + "\n";
report += "Total time cost for visiting those dealers: " + totalTimeCost + " hours" + "\n";
report += "Average time cost: " + (double)totalTimeCost/(count - 1) + " hours";
report += "\n\nDealer List:\n\n";

for (int Dealer = 0; Dealer < count; Dealer++)
    report += collection[Dealer].toString() + "\n";
return report;
}


private void increaseSize()
{
    Dealer[] temp = new Dealer[collection.length * 2];

for (int Dealer = 0; Dealer < collection.length; Dealer++)
    temp[Dealer] = collection[Dealer];
    collection = temp;
}
}