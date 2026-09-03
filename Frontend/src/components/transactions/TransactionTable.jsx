import { Trash ,Pencil } from "lucide-react";

const transactions = [
  {
    id: 1,
    description: "Grocery Shopping",
    amount: 2500,
    type: "EXPENSE",
    category: "Food",
    date: "2026-09-01",
  },
  {
    id: 2,
    description: "Monthly Salary",
    amount: 85000,
    type: "INCOME",
    category: "Salary",
    date: "2026-09-01",
  },
  {
    id: 3,
    description: "Uber Ride",
    amount: 1200,
    type: "EXPENSE",
    category: "Transport",
    date: "2026-08-30",
  },
];

const TransactionTable = () => {
  return (
    <div className="my-16 w-full overflow-hidden rounded-lg border border-gray-200 shadow-sm">
      <div className="overflow-x-auto">
        <table className="w-full text-left text-sm text-gray-600">
          <thead className="bg-gray-50 text-xs uppercase text-gray-700">
            <tr>
              <th scope="col" className="px-6 py-3 text-start text-black font-black">
                Date
              </th>
              <th scope="col" className="px-6 py-3 text-start text-black font-black">
                Category
              </th>
              <th scope="col" className="px-6 py-3 text-start text-black font-black">
                Description
              </th>
              <th scope="col" className="px-6 py-3 text-start text-black font-black">
                Amount
              </th>
              <th scope="col" className="px-6 py-3 text-start text-black font-black">
                Type
              </th>
              <th scope="col" className="px-6 py-3 text-center text-black font-black">
                Action
              </th>
            </tr>
          </thead>
          <tbody className="divide-y divide-gray-200 bg-white">
            {transactions.map((row) => (
              <tr key={row.id} className="hover:bg-gray-50 transition-colors">
                <td className="px-6 py-4 font-medium text-gray-900 whitespace-nowrap">
                  {row.date}
                </td>
                <td className="px-6 py-4 whitespace-nowrap">{row.category}</td>
                <td className="px-6 py-4 whitespace-nowrap">
                  {row.description}
                </td>
                <td className="px-6 py-4 whitespace-nowrap">{row.amount}</td>
                <td className="px-6 py-4 whitespace-nowrap">{row.type}</td>
                <td className="px-6 py-4 whitespace-nowrap flex items-center justify-center gap-4 ">
                  <Pencil className="border border-black/60 text-black/50 font-medium rounded-xl p-2 size-10" />
                  <Trash className="border border-black/60 text-black/50 font-medium rounded-xl p-2 size-10" />
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default TransactionTable;
