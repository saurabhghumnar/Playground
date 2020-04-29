#include<iostream>
using namespace std;
int main()
{
int r,c;
  int sum=0;
  cin>>r>>c;
  int a[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  
  for(int i=0,j=0;j<c;j++)
  {
    sum=sum+a[i][j];
  }
  
  for(int i=r-1,j=0;j<c;j++)
  {
    sum=sum+a[i][j];
  }
 
  for(int i=0;i<c;i++)
  {
    sum=sum+a[i][c-1-i];
  }

  sum=sum-a[0][c-1];
  sum=sum-a[r-1][0];
  
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}