#include<iostream>
using namespace std;
int main()
{
  int n,a=1;
  cin>>n;
  if(n<=1)
  {
   a=0;
  }
  else if(n==2)
  {
   a=1;
  }
  else 
  {
    for(int i = 2; i <= n / 2; i++) 
    {
      if(n % i == 0) 
      {
         a=0;
         break;
      }
  }


}
   if(a==1)
   cout<<"Eligible";
  else
    cout<<"Not eligible";
}