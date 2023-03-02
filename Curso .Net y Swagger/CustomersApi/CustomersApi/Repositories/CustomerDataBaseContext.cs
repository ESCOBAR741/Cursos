using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace CustomersApi.Repositories
{
    public class CustomerDataBaseContext : DbContext
    {
        public DbSet<CustomerEntity> Customer { get; set; }

        public async Task<CustomerEntity> Get(long id)
        {
            return await Customer.FirstAsync(x => x.Id == id);
        }
        public async Task<CustomerEntity> Add(CustomerEntity entity)
        {

        }
    }

    public class CustomerEntity
    {
        public long? Id { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string Email { get; set; }
        public string Phone { get; set; }
        public string Address { get; set; }
    }
}
