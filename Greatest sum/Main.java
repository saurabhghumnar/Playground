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
  //max sum in row
  int rowmax=0;
  int rowno;
  cout<<"Sum of rows is ";
  for(int i=0;i<m;i++)
  {
    cout<<row[i]<<" ";
    if(rowmax<row[i])
    {
      rowmax=row[i];
      rowno=i;
    }
  
  }
  cout<<"\nRow "<<rowno+1<<" has maximum sum";
  
  //column
  
    int column[n];
  for(int i=0;i<n;i++)
  {
    int sum=0;
    for(int j=0;j<m;j++)
    {
      sum=sum+a[j][i];
    }
    column[i]=sum;
  }


 cout<<"\nSum of columns is ";
  int colmax=0;
  int colnum;
for(int i=0;i<n;i++)
{
  cout<<column[i]<<" ";
  if(colmax<column[i])
    {
      colmax=column[i];
      colnum=i;
    }
  
}
/*int colmax=0;
int colno;
for(int k=0;k<n;k++)
  {
    cout<<column[k]<<" ";
    if(colmax<column[k])
    {
      colmax=column[k];
      colno=k;
    }
  
  }
  */
  cout<<"\nColumn "<<colnum+1<<" has maximum sum";
}