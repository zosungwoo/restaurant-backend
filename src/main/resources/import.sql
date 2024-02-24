INSERT INTO users (ELITE,USER_ID,NAME) VALUES (true,1,'james'), (false,2,'donald');

INSERT INTO restaurant (AVERAGE_RATING,LAT,LNG,RESTAURANT_ID,REVIEW_COUNT,ADDRESS,NAME) VALUES (4.5,40.7190597,-73.997622497837,1,2,'149 Mulberry St New York, NY 10013','The Pasta Boss'), (4.9,40.7421597,-74.0053901,2,2,'409 W 15th St New York, NY 10011','Very Fresh Noodles');

INSERT INTO review (RATING,RESTAURANT_ID,REVIEW_ID,USER_ID,REVIEW_TEXT) VALUES (4.0,1,1,1,'good:)'), (4.6,1,2,2,'nice!!!'), (4.8,2,3,1,'waitress is cute'), (5.0,2,4,2,'waitress is pretty');

INSERT INTO restaurant_popular_dish (DISH_ID,RESTAURANT_ID,NAME) VALUES (1,1,'dish1'), (2,1,'dish2'), (3,1,'dish3'), (4,2,'dish1'), (5,2,'dish2'), (6,2,'dish3');
