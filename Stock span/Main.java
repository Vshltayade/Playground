/*#include<iostream>
using namespace std;
int n=0;
void stockSpan(int a[],int *b)
{
  b[0]=1;
  for(int i=1;i<n;i++)
  {
    b[i]=1;
    for(int j=i-1;(j>=0)&&(a[i]>=a[j]);j--)
    {
      b[i]++;
    }
  }
}
void print(int arr[],int n)
{
  for(int i=0;i<n;i++)
  {
    cout<<arr[i]<<endl;
  }
}
int main()
{
  cin>>n;
  int a[n];
  int b[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(int i=0;i<n;i++)
  {
    b[i]=a[i];
  }
  stockSpan(a,b);
  print(b,n);
  return 0;
}
*/




/*#include <iostream>
#include <stack>
using namespace std;

void span(int rates[], int days, int stockspan[]){

  stack<int> stack; //Creating an empty stack

  //Base case
  stockspan[0] = 1;
  stack.push(0);

  for(int i=1; i<days; i++) //iterating through the rates
  {
    //Pop elements out of stack until either: 1) The stack gets empty
    //or 2) the rate at stack top turns out to be larger than the rate
    //at the current element
    while(rates[i] > rates[stack.top()])
    {
      stack.pop();

      if(stack.empty()) 
      {
        break;
      }
    }

    //set the stockspan values.
    if(!stack.empty())
    {
      stockspan[i] = i - stack.top();
    }
    else
    {
      stockspan[i] = i+1;
    }

    stack.push(i);

  }
}
int main() {

  int size;
  cin>>size;
  int rates[size];
  int stockspan[size];
  for(int i=0;i<size;i++)
  {
    cin>>rates[i];
  }

  span(rates, size, stockspan);

  for(int i=0; i<size; i++)
  {
    cout<< stockspan[i] <<endl;
  }
  
}*/



#include<iostream>
using namespace std;
void stockSpan(int n, int *p){
  int s=0;
  cout<<1<<endl;
  for(int i=1;i<n;i++){
    if(p[i]>p[i-1]){
	  s+=2;
      cout<<s<<endl;
    }
    else{
      cout<<1<<endl;}
  }
}
int main()
{
  int n;
  cin>>n;
  int price[n];
  for(int i=0;i<n;i++)
  {
    cin>>price[i];
  }
  //Type your code here.
  stockSpan(n,price);
  return 0;
}