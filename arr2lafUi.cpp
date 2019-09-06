#include <iostream>
using namespace std; 
int main ()
{
	int arr[5];
	for(int k = 0;k <= 5;k++){
	cout<<"enter valr   ";
	cin >> arr[k];
	}
for(int i = 0; i < 5; i++){
for(int j = i+1; j < 5; j++)
if(arr[i] < arr[j]){
	int temp =arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
}
cout<<arr[1]<<"is 2nd largest "<<endl;
cout<<arr[3]<<"is 2nd smalest "<<endl;
}
