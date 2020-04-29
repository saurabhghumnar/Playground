#include<iostream>
using namespace std;

int gcd(int a,int b,int small)
{
 if(a%small==0 && b%small==0)
    return small;
  else
    gcd(a,b,small-1);
}

int main()
{
int a,b;
  cin>>a>>b;
  int small=0;
  if(a<b)
    small=a;
  else
    small=b;
  int ans=gcd(a,b,small);
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<ans;
  
}