#include<iostream>
using namespace std;
int ans;
int f[10];
int digitroot(int n)
{
  int i=0;
  int sum=0;
  while(n>0)
  {
    ans=n%10;
    n=n/10;
    f[i]=ans;
    i++;
  }
  for(int j=0;j<i;j++)
  {
    sum=sum+f[j];
  }
  if(sum<=9)
    return sum;
  else
    digitroot(sum);
}

int main()
{
  int n,val;
  cin>>n;
  val=digitroot(n);
  cout<<val;
}
