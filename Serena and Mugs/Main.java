#include<iostream>
using namespace std;

int printresult(int* a,int n,int s)
{
   if(n<2 || n>100 ||s<1 ||s>1000)
  {
    cout<<"NO";
  }
  int sum=0;
  for(int i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
  if(sum<=s)
    cout<<"YES";
  else
    cout<<"NO";
}

int main()
{
int n,s;
  cin>>n>>s;
 
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
printresult(a,n,s);
  return 0;
}