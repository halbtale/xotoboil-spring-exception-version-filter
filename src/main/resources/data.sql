INSERT INTO user_details
VALUES ( current_date(), 1001, 'alberto');

INSERT INTO user_details
VALUES ( current_date(), 1002, 'mark');

INSERT INTO user_details
VALUES ( current_date(), 1003, 'bob');

INSERT INTO post(id, description, user_id)
VALUES (2001, 'I want to learn AWS', 1001);

INSERT INTO post(id, description, user_id)
VALUES (2002, 'I want to learn Java', 1001);

INSERT INTO post(id, description, user_id)
VALUES (2003, 'I want to learn Spring', 1002);

INSERT INTO post(id, description, user_id)
VALUES (2004, 'I want to learn Python', 1002);