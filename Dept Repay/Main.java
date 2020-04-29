#include<iostream>
using namespace std;
int main()
{
  int x,r,y;
 
  std::cin>>x>>r>>y;
 int i=x*r*y/100;
    std::cout<<i;
  int a=x+i;
      std::cout<<"\n"<<a;
  float d=0.02f*i;
   std::cout<<"\n"<<d;
  float l=a-d;


   
    std::cout<<"\n"<<l;
}
