#include<iostream>
using namespace std;
int main()
{
int n,i,j,k;
  cin>>n;
  int temp=n;
  for(int i=1;i<=n;i++)
  {
    if (i%2 != 0) 
        { 
            // print numbers with the '*' sign in  
            // increasing order 
            for (j=k+1; j<k+i; j++) 
                cout << i << "*"; 
            cout << i << endl; 
              
            // update value of 'k'     
            k = j;     
        } 
          
        // if row number is even 
        else
        { 
            // update value of 'k' 
            k = k+i-1; 
              
            // print numbers with the '*' in  
            // decreasing order 
            for (j=k; j>k-i+1; j--) 
                cout << i << "*"; 
            cout << i << endl;     
        } 
  }
  n=temp;
   for(int i=n;i>=1;i--)
  {
    if (i%2 != 0) 
        { 
            // print numbers with the '*' sign in  
            // increasing order 
            for (j=k+1; j<k+i; j++) 
                cout << i << "*"; 
            cout << i << endl; 
              
            // update value of 'k'     
            k = j;     
        } 
          
        // if row number is even 
        else
        { 
            // update value of 'k' 
            k = k+i-1; 
              
            // print numbers with the '*' in  
            // decreasing order 
            for (j=k; j>k-i+1; j--) 
                cout << i << "*"; 
            cout << i << endl;     
        } 
}
}