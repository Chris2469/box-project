package boxes;

class Box {                                        
    int length;
    int width;                                      
    int height;
    
    Box(int length, int width, int height) {        
        this.length = length;
        this.width = width;                         
        this.height = height;
    }
             
    int getVolume() {                                  
        return length * width * height;               
    }
    
} 
