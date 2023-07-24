public class Connection {


    // MM but we don't have a URL?
    URLConnection connection = new URL("<some_url>/<endpoint>?param1=value1&param2=value2").openConnection();
    connection.setRequestProperty("header1", header1);
    connection.setRequestProperty("header2", header2);
    //Get Response  
    InputStream is = connection.getInputStream();
    System.out.println(connection.getContentType());
}