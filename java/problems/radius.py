def switchCase( choice, arr):
        match choice:
            case 1:
                
                return 3.1415926535*arr[0]*arr[0]
            case 2:
                
                return arr[0]*arr[1]
        
        # Code here


arr=[5,65]
radius=switchCase(2,arr)
print(radius)