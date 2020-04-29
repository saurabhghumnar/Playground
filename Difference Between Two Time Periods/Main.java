#include<iostream>
using namespace std;

struct time
{
  int hours;
  int minutes;
  int seconds;
}t1,t2,t3;

int main()
{
	cin>>t1.hours;
    cin>>t1.minutes;
    cin>>t1.seconds;

    cin>>t2.hours;
    cin>>t2.minutes;
    cin>>t2.seconds;
  
  if(t1.seconds>=t2.seconds)
  {
    t3.seconds=t1.seconds-t2.seconds;
  }
  else
  {
    t3.seconds=(t1.seconds+60)-t2.seconds;
    t1.minutes=t1.minutes-1;
  }

    if(t1.minutes>=t2.minutes)
  {
    t3.minutes=t1.minutes-t2.minutes;
  }
  else
  {
    t3.minutes=(t1.minutes+60)-t2.minutes;
     t1.hours=t1.hours-1;
  }
 
  t3.hours=t1.hours-t2.hours;
  cout<<t3.hours<<":"<<t3.minutes<<":"<<t3.seconds;

  }