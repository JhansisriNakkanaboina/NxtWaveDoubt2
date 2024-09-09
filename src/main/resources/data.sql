INSERT INTO Category (id, name, description) VALUES
(1, 'Electronics', 'Gadgets and devices for everyday use.'),
(2, 'Books', 'Novels, textbooks, and other reading materials.'),
(3, 'Fashion', 'Clothing, footwear, and accessories.');

INSERT INTO Product (name, description, price, categoryId) VALUES
('Laptop', 'A high-performance laptop suitable for gaming and professional tasks.', 50000.00, 1),
('Bluetooth Speaker', 'A portable speaker with excellent sound quality.', 2500.00, 1),
('Mystery Novel', 'A thrilling novel full of twists and turns.', 500.00, 2),
('History Textbook', 'A comprehensive guide to world history.', 400.00, 2),
('Leather Jacket', 'A stylish jacket made of genuine leather.', 2200.00, 3),
('Running Shoes', 'Comfortable shoes perfect for jogging.', 700.00, 3);