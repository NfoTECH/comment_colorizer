package com.example.appsmith2;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class AppSmith2Application {

    public static void main(String[] args) {

        // JSON string containing the comments data
        String jsonString= "[\n" +
                "  {\n" +
                "    \"id\": \"1\",\n" +
                "    \"comment\": \"Hello World in Rust\",\n" +
                "    \"color\": \"rust\",\n" +
                "    \"user\": {\n" +
                "      \"name\": \"Rustacean\",\n" +
                "      \"id\": \"1\"\n" +
                "    },\n" +
                "    \"replies\": [\n" +
                "      {\n" +
                "        \"comment\": \"Hello World!\",\n" +
                "        \"id\": \"2\",\n" +
                "        \"color\": \"pink\",\n" +
                "        \"user\": {\n" +
                "          \"name\": \"Pinkie Pie\",\n" +
                "          \"id\": \"5\"\n" +
                "        },\n" +
                "        \"upvotes\": 3,\n" +
                "        \"downvotes\": 0,\n" +
                "        \"replies\": [\n" +
                "          {\n" +
                "            \"comment\": \"Hello Pinkie Pie!\",\n" +
                "            \"id\": \"3\",\n" +
                "            \"color\": \"blue\",\n" +
                "            \"user\": {\n" +
                "              \"name\": \"Rainbow Dash\",\n" +
                "              \"id\": \"6\"\n" +
                "            },\n" +
                "            \"upvotes\": 1,\n" +
                "            \"downvotes\": 0,\n" +
                "            \"replies\": [\n" +
                "              {\n" +
                "                \"comment\": \"Hello Rainbow Dash!\",\n" +
                "                \"id\": \"4\",\n" +
                "                \"color\": \"green\",\n" +
                "                \"user\": {\n" +
                "                  \"name\": \"Fluttershy\",\n" +
                "                  \"id\": \"7\"\n" +
                "                },\n" +
                "                \"upvotes\": 2,\n" +
                "                \"downvotes\": 0\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          {\n" +
                "            \"comment\": \"Hello Pinkie Pie!\",\n" +
                "            \"id\": \"4\",\n" +
                "            \"color\": \"green\",\n" +
                "            \"user\": {\n" +
                "              \"name\": \"Fluttershy\",\n" +
                "              \"id\": \"7\"\n" +
                "            },\n" +
                "            \"upvotes\": 2,\n" +
                "            \"downvotes\": 0,\n" +
                "            \"replies\": [\n" +
                "              {\n" +
                "                \"comment\": \"Hello Fluttershy!\",\n" +
                "                \"id\": \"5\",\n" +
                "                \"color\": \"blue\",\n" +
                "                \"user\": {\n" +
                "                  \"name\": \"Rainbow Dash\",\n" +
                "                  \"id\": \"6\"\n" +
                "                },\n" +
                "                \"upvotes\": 1,\n" +
                "                \"downvotes\": 0\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"comment\": \"Hello World!\",\n" +
                "        \"id\": \"5\",\n" +
                "        \"color\": \"blue\",\n" +
                "        \"user\": {\n" +
                "          \"name\": \"Rainbow Dash\",\n" +
                "          \"id\": \"6\"\n" +
                "        },\n" +
                "        \"upvotes\": 1,\n" +
                "        \"downvotes\": 0\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"2\",\n" +
                "    \"comment\": \"Hello Universe in Python\",\n" +
                "    \"color\": \"python\",\n" +
                "    \"user\": {\n" +
                "      \"name\": \"Pythonista\",\n" +
                "      \"id\": \"2\"\n" +
                "    },\n" +
                "    \"replies\": [\n" +
                "      {\n" +
                "        \"comment\": \"Hello Pythonista!\",\n" +
                "        \"id\": \"6\",\n" +
                "        \"color\": \"yellow\",\n" +
                "        \"user\": {\n" +
                "          \"name\": \"Pikachu\",\n" +
                "          \"id\": \"8\"\n" +
                "        },\n" +
                "        \"upvotes\": 5,\n" +
                "        \"downvotes\": 0\n" +
                "      },\n" +
                "      {\n" +
                "        \"comment\": \"Hello Pythonista!\",\n" +
                "        \"id\": \"7\",\n" +
                "        \"color\": \"yellow\",\n" +
                "        \"user\": {\n" +
                "          \"name\": \"Pikachu\",\n" +
                "          \"id\": \"8\"\n" +
                "        },\n" +
                "        \"upvotes\": 5,\n" +
                "        \"downvotes\": 0\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"3\",\n" +
                "    \"comment\": \"Hello Galaxy in Java\",\n" +
                "    \"color\": \"java\",\n" +
                "    \"user\": {\n" +
                "      \"name\": \"Javacoder\",\n" +
                "      \"id\": \"3\"\n" +
                "    },\n" +
                "    \"replies\": [\n" +
                "      {\n" +
                "        \"comment\": \"Hello Javacoder!\",\n" +
                "        \"id\": \"8\",\n" +
                "        \"color\": \"orange\",\n" +
                "        \"user\": {\n" +
                "          \"name\": \"Tigger\",\n" +
                "          \"id\": \"9\"\n" +
                "        },\n" +
                "        \"upvotes\": 4,\n" +
                "        \"downvotes\": 0,\n" +
                "        \"replies\": [\n" +
                "          {\n" +
                "            \"comment\": \"Hello Tigger!\",\n" +
                "            \"id\": \"9\",\n" +
                "            \"color\": \"purple\",\n" +
                "            \"user\": {\n" +
                "              \"name\": \"Winnie the Pooh\",\n" +
                "              \"id\": \"10\"\n" +
                "            },\n" +
                "            \"upvotes\": 3,\n" +
                "            \"downvotes\": 0,\n" +
                "            \"replies\": [\n" +
                "              {\n" +
                "                \"comment\": \"Hello Winnie the Pooh!\",\n" +
                "                \"id\": \"10\",\n" +
                "                \"color\": \"brown\",\n" +
                "                \"user\": {\n" +
                "                  \"name\": \"Piglet\",\n" +
                "                  \"id\": \"11\"\n" +
                "                },\n" +
                "                \"upvotes\": 2,\n" +
                "                \"downvotes\": 0,\n" +
                "                \"replies\": [\n" +
                "                  {\n" +
                "                    \"comment\": \"Hello Piglet!\",\n" +
                "                    \"id\": \"11\",\n" +
                "                    \"color\": \"pink\",\n" +
                "                    \"user\": {\n" +
                "                      \"name\": \"Eeyore\",\n" +
                "                      \"id\": \"12\"\n" +
                "                    },\n" +
                "                    \"upvotes\": 1,\n" +
                "                    \"downvotes\": 0\n" +
                "                  }\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"comment\": \"Hello Javacoder!\",\n" +
                "        \"id\": \"12\",\n" +
                "        \"color\": \"pink\",\n" +
                "        \"user\": {\n" +
                "          \"name\": \"Eeyore\",\n" +
                "          \"id\": \"12\"\n" +
                "        },\n" +
                "        \"upvotes\": 1,\n" +
                "        \"downvotes\": 0\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"4\",\n" +
                "    \"comment\": \"Hello Multiverse in C++\",\n" +
                "    \"color\": \"cpp\",\n" +
                "    \"user\": {\n" +
                "      \"name\": \"Cppcoder\",\n" +
                "      \"id\": \"4\"\n" +
                "    },\n" +
                "    \"replies\": [\n" +
                "      {\n" +
                "        \"comment\": \"Hello Cppcoder!\",\n" +
                "        \"id\": \"13\",\n" +
                "        \"color\": \"purple\",\n" +
                "        \"user\": {\n" +
                "          \"name\": \"Winnie the Pooh\",\n" +
                "          \"id\": \"10\"\n" +
                "        },\n" +
                "        \"upvotes\": 3,\n" +
                "        \"downvotes\": 0,\n" +
                "        \"replies\": [\n" +
                "          {\n" +
                "            \"comment\": \"Hello Winnie the Pooh!\",\n" +
                "            \"id\": \"14\",\n" +
                "            \"color\": \"brown\",\n" +
                "            \"user\": {\n" +
                "              \"name\": \"Piglet\",\n" +
                "              \"id\": \"11\"\n" +
                "            },\n" +
                "            \"upvotes\": 2,\n" +
                "            \"downvotes\": 0,\n" +
                "            \"replies\": [\n" +
                "              {\n" +
                "                \"comment\": \"Hello Piglet!\",\n" +
                "                \"id\": \"15\",\n" +
                "                \"color\": \"pink\",\n" +
                "                \"user\": {\n" +
                "                  \"name\": \"Eeyore\",\n" +
                "                  \"id\": \"12\"\n" +
                "                },\n" +
                "                \"upvotes\": 1,\n" +
                "                \"downvotes\": 0\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"comment\": \"Hello Cppcoder!\",\n" +
                "        \"id\": \"16\",\n" +
                "        \"color\": \"pink\",\n" +
                "        \"user\": {\n" +
                "          \"name\": \"Eeyore\",\n" +
                "          \"id\": \"12\"\n" +
                "        },\n" +
                "        \"upvotes\": 1,\n" +
                "        \"downvotes\": 0\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"5\",\n" +
                "    \"comment\": \"Hello Cosmos in JavaScript\",\n" +
                "    \"color\": \"javascript\",\n" +
                "    \"user\": {\n" +
                "      \"name\": \"JavaScripter\",\n" +
                "      \"id\": \"5\"\n" +
                "    },\n" +
                "    \"replies\": [\n" +
                "      {\n" +
                "        \"comment\": \"Hello JavaScripter!\",\n" +
                "        \"id\": \"17\",\n" +
                "        \"color\": \"orange\",\n" +
                "        \"user\": {\n" +
                "          \"name\": \"Tigger\",\n" +
                "          \"id\": \"9\"\n" +
                "        },\n" +
                "        \"upvotes\": 4,\n" +
                "        \"downvotes\": 0,\n" +
                "        \"replies\": [\n" +
                "          {\n" +
                "            \"comment\": \"Hello Tigger!\",\n" +
                "            \"id\": \"18\",\n" +
                "            \"color\": \"purple\",\n" +
                "            \"user\": {\n" +
                "              \"name\": \"Winnie the Pooh\",\n" +
                "              \"id\": \"10\"\n" +
                "            },\n" +
                "            \"upvotes\": 3,\n" +
                "            \"downvotes\": 0,\n" +
                "            \"replies\": [\n" +
                "              {\n" +
                "                \"comment\": \"Hello Winnie the Pooh!\",\n" +
                "                \"id\": \"19\",\n" +
                "                \"color\": \"brown\",\n" +
                "                \"user\": {\n" +
                "                  \"name\": \"Piglet\",\n" +
                "                  \"id\": \"11\"\n" +
                "                },\n" +
                "                \"upvotes\": 2,\n" +
                "                \"downvotes\": 0,\n" +
                "                \"replies\": [\n" +
                "                  {\n" +
                "                    \"comment\": \"Hello Piglet!\",\n" +
                "                    \"id\": \"20\",\n" +
                "                    \"color\": \"pink\",\n" +
                "                    \"user\": {\n" +
                "                      \"name\": \"Eeyore\",\n" +
                "                      \"id\": \"12\"\n" +
                "                    },\n" +
                "                    \"upvotes\": 1,\n" +
                "                    \"downvotes\": 0\n" +
                "                  }\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"comment\": \"Hello JavaScripter!\",\n" +
                "        \"id\": \"21\",\n" +
                "        \"color\": \"pink\",\n" +
                "        \"user\": {\n" +
                "          \"name\": \"Eeyore\",\n" +
                "          \"id\": \"12\"\n" +
                "        },\n" +
                "        \"upvotes\": 1,\n" +
                "        \"downvotes\": 0\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"6\",\n" +
                "    \"comment\": \"Hello Dimension in Go\",\n" +
                "    \"color\": \"go\",\n" +
                "    \"user\": {\n" +
                "      \"name\": \"Gopher\",\n" +
                "      \"id\": \"6\"\n" +
                "    },\n" +
                "    \"replies\": [\n" +
                "      {\n" +
                "        \"comment\": \"Hello Gopher!\",\n" +
                "        \"id\": \"22\",\n" +
                "        \"color\": \"orange\",\n" +
                "        \"user\": {\n" +
                "          \"name\": \"Tigger\",\n" +
                "          \"id\": \"9\"\n" +
                "        },\n" +
                "        \"upvotes\": 4,\n" +
                "        \"downvotes\": 0,\n" +
                "        \"replies\": [\n" +
                "          {\n" +
                "            \"comment\": \"Hello Tigger!\",\n" +
                "            \"id\": \"23\",\n" +
                "            \"color\": \"purple\",\n" +
                "            \"user\": {\n" +
                "              \"name\": \"Winnie the Pooh\",\n" +
                "              \"id\": \"10\"\n" +
                "            },\n" +
                "            \"upvotes\": 3,\n" +
                "            \"downvotes\": 0,\n" +
                "            \"replies\": [\n" +
                "              {\n" +
                "                \"comment\": \"Hello Winnie the Pooh!\",\n" +
                "                \"id\": \"24\",\n" +
                "                \"color\": \"brown\",\n" +
                "                \"user\": {\n" +
                "                  \"name\": \"Piglet\",\n" +
                "                  \"id\": \"11\"\n" +
                "                },\n" +
                "                \"upvotes\": 2,\n" +
                "                \"downvotes\": 0,\n" +
                "                \"replies\": [\n" +
                "                  {\n" +
                "                    \"comment\": \"Hello Piglet!\",\n" +
                "                    \"id\": \"25\",\n" +
                "                    \"color\": \"pink\",\n" +
                "                    \"user\": {\n" +
                "                      \"name\": \"Eeyore\",\n" +
                "                      \"id\": \"12\"\n" +
                "                    },\n" +
                "                    \"upvotes\": 1,\n" +
                "                    \"downvotes\": 0\n" +
                "                  }\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"comment\": \"Hello Gopher!\",\n" +
                "        \"id\": \"26\",\n" +
                "        \"color\": \"pink\",\n" +
                "        \"user\": {\n" +
                "          \"name\": \"Eeyore\",\n" +
                "          \"id\": \"12\"\n" +
                "        },\n" +
                "        \"upvotes\": 1,\n" +
                "        \"downvotes\": 0\n" +
                "      }\n" +
                "    ]\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\": \"7\",\n" +
                "    \"comment\": \"Hello Parallel Universe in Ruby\",\n" +
                "    \"color\": \"ruby\",\n" +
                "    \"user\": {\n" +
                "      \"name\": \"Rubycoder\",\n" +
                "      \"id\": \"7\"\n" +
                "    },\n" +
                "    \"replies\": [\n" +
                "      {\n" +
                "        \"comment\": \"Hello Rubycoder!\",\n" +
                "        \"id\": \"27\",\n" +
                "        \"color\": \"orange\",\n" +
                "        \"user\": {\n" +
                "          \"name\": \"Tigger\",\n" +
                "          \"id\": \"9\"\n" +
                "        },\n" +
                "        \"upvotes\": 4,\n" +
                "        \"downvotes\": 0,\n" +
                "        \"replies\": [\n" +
                "          {\n" +
                "            \"comment\": \"Hello Tigger!\",\n" +
                "            \"id\": \"28\",\n" +
                "            \"color\": \"purple\",\n" +
                "            \"user\": {\n" +
                "              \"name\": \"Winnie the Pooh\",\n" +
                "              \"id\": \"10\"\n" +
                "            },\n" +
                "            \"upvotes\": 3,\n" +
                "            \"downvotes\": 0,\n" +
                "            \"replies\": [\n" +
                "              {\n" +
                "                \"comment\": \"Hello Winnie the Pooh!\",\n" +
                "                \"id\": \"29\",\n" +
                "                \"color\": \"brown\",\n" +
                "                \"user\": {\n" +
                "                  \"name\": \"Piglet\",\n" +
                "                  \"id\": \"11\"\n" +
                "                },\n" +
                "                \"upvotes\": 2,\n" +
                "                \"downvotes\": 0,\n" +
                "                \"replies\": [\n" +
                "                  {\n" +
                "                    \"comment\": \"Hello Piglet!\",\n" +
                "                    \"id\": \"30\",\n" +
                "                    \"color\": \"pink\",\n" +
                "                    \"user\": {\n" +
                "                      \"name\": \"Eeyore\",\n" +
                "                      \"id\": \"12\"\n" +
                "                    },\n" +
                "                    \"upvotes\": 1,\n" +
                "                    \"downvotes\": 0\n" +
                "                  }\n" +
                "                ]\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        ]\n" +
                "      },\n" +
                "      {\n" +
                "        \"comment\": \"Hello Rubycoder!\",\n" +
                "        \"id\": \"31\",\n" +
                "        \"color\": \"pink\",\n" +
                "        \"user\": {\n" +
                "          \"name\": \"Eeyore\",\n" +
                "          \"id\": \"12\"\n" +
                "        },\n" +
                "        \"upvotes\": 1,\n" +
                "        \"downvotes\": 0\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "]";

        // A Scanner object to take in user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the color you want to search for : ");
        String searchColor = scanner.nextLine();

        // Parse the JSON string into a JSONArray. Import the dependency in pom.xml file
        JSONArray commentsArray = new JSONArray(jsonString);

        //List to store comments with the specified color
        List<String> pinkComments = new ArrayList<>();

        //method/function call to find comments with the specified color
         findCommentsWithColor(commentsArray, searchColor, pinkComments);

         //print comment with the specified color
        for (String comment: pinkComments){
            System.out.println(comment);
        }
        // Print total number of comments with the specified color
        System.out.println("total comment with color " + searchColor + ": " + pinkComments.size());




//        SpringApplication.run(AppSmith2Application.class, args);
    }

    // Method to find comments with the specified color
    private  static  void findCommentsWithColor(JSONArray jsonArray, String colorToSearch ,List<String> commentWithColor ){
       for (int i = 0; i< jsonArray.length(); i++){
           JSONObject jsonObject = jsonArray.getJSONObject(i);

           // Check if the current object has a "color" property and if it matches the specified color
       if (jsonObject.has("color") && jsonObject.getString("color").equals(colorToSearch)){
       commentWithColor.add(jsonObject.getString("comment"));

       }

           // If the current object has "replies", recursively call this method on the "replies" array
        if (jsonObject.has("replies")){
            JSONArray replies = jsonObject.getJSONArray("replies");

                findCommentsWithColor(replies, colorToSearch, commentWithColor);
            }
        }

    }

}
