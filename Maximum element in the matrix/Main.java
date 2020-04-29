#include<iostream>
using namespace std;
int main()
{
int m,n;
  
  int max=0;
  cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
      if(max<a[i][j])
      {
        max=a[i][j];
      }
    }
  }
  cout<<"The maximum element is "<<max;
}