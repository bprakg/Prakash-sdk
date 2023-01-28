# Prakash-sdk

This is the java sdk for LOTR api.  Invoking is a 2 step process as follows;
1. Build a lotr base sdk class using the builder like this "LOTR lotr = LOTRimpl.Builder().withAPIKey("your api key");"
2. Using this class, invoke the api methods like this "lotr.getAllMovies();"
  
Heres the screenshot of these two steps;
 
<img width="1126" alt="Screenshot 2023-01-28 at 2 17 10 AM" src="https://user-images.githubusercontent.com/8314346/215261244-7e2310e8-40cb-4612-8df7-329d499f2d3d.png">


Screen shot of the result is here;
<img width="1430" alt="Screenshot 2023-01-28 at 2 20 16 AM" src="https://user-images.githubusercontent.com/8314346/215261359-823f2af5-3c5a-4f26-9d4a-805696e65516.png">


All operations of the api can be invoked through these interface methods;
<img width="934" alt="Screenshot 2023-01-28 at 2 18 48 AM" src="https://user-images.githubusercontent.com/8314346/215261291-0a431255-cc96-4e6c-8627-c3e3ec3095a6.png">

  
Code organizations is as follows;
<img width="289" alt="Screenshot 2023-01-28 at 2 13 55 AM" src="https://user-images.githubusercontent.com/8314346/215260926-2d6cb2ca-41d7-4c1f-afce-fc372e168c01.png">

Self documenting coding technique is used so the code is mostly selp explanatory.  
