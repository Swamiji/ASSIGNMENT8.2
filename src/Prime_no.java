
public class Prime_no implements Runnable {
	 public void run()
	    {
	        int no;
	        for(no=1;no<=1000;no++)
	        {
	            int sum=0;
	            for(int i=1;i<=no/2;i++)
	            {
	                if(no%i==0)
	                    sum=sum+i;
	            }
	            if(no==sum)
	                System.out.println(no+" Number is perfect or Not Prime");
	        try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        }
	        
	    }
	}

	class Prime implements Runnable
	{
	    public void run()
	    {
	        int no;
	        for(no=2;no<=1000;no++)
	        {
	            int cnt=0;
	            for(int i=2;i<=no/2;i++)
	                if(no%i==0)
	                {
	                    cnt++;
	                    break;
	                }
	            if(cnt==0)
	                System.out.println(no+" Number is prime");
	        try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        }
	    }
	}


	class PerfectPrime
	{
	    public static void main(String args[])
	    {
	        try
	        {
	            Prime_no p=new Prime_no();
	            Thread t1=new Thread(p);
	            Prime p1=new Prime();
	            Thread t2=new Thread(p1);
	            t1.start();
	            t2.start();
	        }
	        catch(Exception e1){}
	    }
	}

