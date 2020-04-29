#include<iostream>
using namespace std;

struct distance
{
  int feet;
  float inch;

}t1,t2,t3;

int main()
{
  
  char a='"';
	cin>>t1.feet;
    cin>>t1.inch;
   

    cin>>t2.feet;
    cin>>t2.inch;

  t3.inch=t1.inch+t2.inch;
  
  
  if(t3.inch>12)
  {
    t3.inch=t3.inch-12;
    t1.feet=t1.feet+1;
  }
  else
  {
    t3.inch=t3.inch;
  }

  t3.feet=t1.feet+t2.feet;
  

  cout<<t3.feet<<"'-"<<t3.inch<<a;

  }