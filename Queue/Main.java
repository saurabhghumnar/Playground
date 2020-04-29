#include<iostream>
using namespace std;
void queue(int n,int m,int *a)
{
  int c=0,i;
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]==m)
      c=c+1;
    else if(a[i]+a[i+1]<=m&&a[i]>a[i+1])
    {
      c=c+1;
      i=i+1;
    }
   else
    {
      c=c+1;
    }
  }
  std::cout<<c;
 }
int main()
{
 int n,m;
  std::cin>>n>>m;
  int a[n];
  queue(n,m,a);
  return 0;
}