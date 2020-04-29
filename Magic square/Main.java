#include<iostream>
using namespace std;
int main()
{
int n;
  cin>>n;
  if(n>5 || n<0)
  {
    cout<<"No";
  }
  int a[n][n];
  int flag=0;
  
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  //diagonals
  int sum = 0,sum2=0;  
    for (int i = 0; i < n; i++) 
        sum = sum + a[i][i]; 
    // the secondary diagonal 
    for (int i = 0; i < n; i++) 
        sum2 = sum2 + a[i][n-1-i]; 
  
    if(sum!=sum2)  
    {
    flag=1;
    }
  
  //rows
    for (int i = 0; i < n; i++) 
    { 
       int rowSum = 0;      
        for (int j = 0; j < n; j++) 
          rowSum += a[i][j];
		if (rowSum != sum) 
          flag=1;
    } 
  
  // For sums of Columns 
    for (int i = 0; i < n; i++) 
    { 
        int colSum = 0;      
        for (int j = 0; j < n; j++) 
            colSum += a[j][i]; 
  
        if (sum != colSum)  
        {
       flag=1;
    
        }   
    } 
  
  if(flag==1)
    cout<<"No";
  else if (flag==0)
    cout<<"Yes";
}