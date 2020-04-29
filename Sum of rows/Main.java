#include<iostream>
using namespace std;
int main()
{
int m,n;
  cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  //row
  int row[m];
  for(int i=0;i<m;i++)
  {
    int sum=0;
    for(int j=0;j<n;j++)
    {
      sum=sum+a[i][j];
    }
    row[i]=sum;
  }

  for(int i=0;i<m;i++)
  {
    cout<<row[i]<<"\n";
    
  }
}