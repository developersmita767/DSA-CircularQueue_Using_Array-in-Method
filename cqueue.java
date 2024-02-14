//CircularQueue using array
import java.util.*;
class CQueue
{
	int front,rear,max;
	int arr[];
	CQueue(int max)
	{
	   front=-1;
	   rear=-1;
	   this.max=max;
	   arr=new int[max];
	}
	void enqueue(int ele)
	{
	  if((front==0&&rear==max-1)||(front==rear+1))
	  {
	   System.out.println("CQ overflow");
	   return;
	  }
	  if(front==-1)
	  {
	    front=0;
	  }
	  if(rear==max-1)
	  {
	    rear=0;
	  }
	  else
	  {
	    rear++;
	  }
	  arr[rear]=ele;
	  System.out.println(ele+" insert ");
	}
	void Dequeue()
	{
	  if(front==-1)
	  {
	    System.out.println("CQ underflow or no element");
	    return;
	  } 
	  System.out.println("delete element="+arr[front]);
	    if(front==max-1)
	    {
	      front=0;
	      return;
	    }
	    if(front==rear)
	    {
	      front=-1;
	      rear=-1;
	      return;
	    }
	    front=front+1;
	}
	void peek()
	{
	  if(front==-1)
	  {
	   System.out.println("CQ underflow or no element");
	    return;
	  }

	  System.out.println("top element="+arr[front]);
	}
	void disp()
	{
	 if(front==-1)
	 {
	   System.out.println("CQ underflow or no element");
	    return;
	 }
	  System.out.println("elements are ");
	  if(front<=rear)
	  {
	    int i=front;
	    while(i<=rear)
	    {
	      System.out.println(arr[i]);
	      i++;
	    }
	  }
	  else
	  {
	    int i=front;
	    while(i<=max-1)
	    {
	      System.out.println(arr[i]);
	      i++;
	    }
	    i=0;
	    while(i<=rear)
	    {
	      System.out.println(arr[i]);
	      i++;
	    }
	  }
	}
}
//driverclass
class Test
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
       CQueue m=new CQueue(5);
       int ch;
       while(true)
       {
         System.out.println("enter your choice\n1.insert\n2.delete\n3.peek\n4.disp\n5.exit");
         ch=sc.nextInt();
         switch(ch)
         {
          case 1:
          System.out.println("enter a element to push");
          m.enqueue(sc.nextInt());
          break;
          case 2:
          m.Dequeue();
          break;
          case 3:
          m.peek();
          break;
          case 4:
          m.disp();
          break;
          case 5:
          System.exit(0);
          default:System.out.println("invalid choice ");

         }
       }	
	}
}
	
