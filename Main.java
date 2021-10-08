public class Main 
{
    public static void main(String[] args) 
    {
        double split = 10000000;
        int tickets = 1;
        int bestTickets = 0;
        double maxProfit = 0;
        double myProfit = 0;
        while(tickets<(10000000-10))
        {
            myProfit = 10000000/(tickets+10)*tickets-tickets;
            if(myProfit>maxProfit)
            {
                maxProfit = myProfit;
                bestTickets=tickets;
                //System.out.println(tickets + " " + myProfit);
            }
            tickets++;
        }
        System.out.println("tickets: "+ bestTickets);
        System.out.println("profit " + maxProfit);
    }
}
