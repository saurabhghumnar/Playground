#include<iostream>
using namespace std;
int main()
{
int m,n;
  cin>>m>>n;
  if(m>10 || n>10|| m<0 || n<0)
    cout<<"Invalid Input";
int a[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }


  for(int i=0;i<n;i++)
  {
    int max=0;
    for(int j=0;j<m;j++)
    {
      if(max<a[j][i])
      {
        max=a[j][i];
      }
      else
      {
        max=max;
      }
    }
    cout<<max<<"\n";
  }
}