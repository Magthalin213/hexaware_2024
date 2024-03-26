use bank_system;
-- drop database bank_system;
INSERT INTO customer (id, first_name, last_name, email, phone_number, address)
VALUES
    (1, 'John', 'Doe', 'johndoe@example.com', '123-456-7890', '123 Main St'),
    (2, 'Alice', 'Smith', 'alice.smith@example.com', '987-654-3210', '456 Elm St'),
    (3, 'Michael', 'Johnson', 'mike.johnson@example.com', '555-123-4567', '789 Oak St'),
    (4, 'Emily', 'Brown', 'emily.b@example.com', '333-444-5555', '321 Pine St'),
    (5, 'Sarah', 'Lee', 'sarah.lee@example.com', '777-888-9999', '567 Cedar St');

INSERT INTO account (customer_id, account_number, account_type, account_balance) VALUES
    (1, 'ACC123456789', 'Saving', 5000.00),
    (2, 'ACC987654321', 'Current', 10000.00),
    (3, 'ACC555123456', 'Saving', 7500.00),
    (4, 'ACC333444555', 'Current', 20000.00),
    (5, 'ACC777888999', 'Saving', 3000.00);

select * from customer;
select * from account order by customer_id;